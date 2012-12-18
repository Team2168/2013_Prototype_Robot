package edu.wpi.first.wpilibj;

import edu.wpi.first.wpilibj.parsing.IDeviceController;

public class Talon extends SafePWM implements SpeedController, IDeviceController {

    /**
     * Common initialization code called by all constructors.
     *
     * These values need to be collected from Talon(s) emperically.
     *   - 205 = full "forward"
     *   - 155 = the "high end" of the deadband range
     *   - 150 = center of the deadband range (off)
     *   - 145 = the "low end" of the deadband range
     *   - 85 = full "reverse"
     */
    private void initTalon() {
    	//TODO: Update these with real values from a talon
        setBounds(205, 155, 150, 145, 85);
        setPeriodMultiplier(PeriodMultiplier.k2X);
        setRaw(m_centerPwm);
    }

    /**
     * Constructor that assumes the default digital module.
     *
     * @param channel The PWM channel on the digital module that the Talon is attached to.
     */
    public Talon(final int channel) {
        super(channel);
        initTalon();
    }

    /**
     * Constructor that specifies the digital module.
     *
     * @param slot The slot in the chassis that the digital module is plugged into.
     * @param channel The PWM channel on the digital module that the Talon is attached to.
     */
    public Talon(final int slot, final int channel) {
        super(slot, channel);
        initTalon();
    }

    /**
     * Set the PWM value.
     *
     * @deprecated For compatibility with CANJaguar
     *
     * The PWM value is set using a range of -1.0 to 1.0, appropriately
     * scaling the value for the FPGA.
     *
     * @param speed The speed to set.  Value should be between -1.0 and 1.0.
     * @param syncGroup The update group to add this Set() to, pending UpdateSyncGroup().  If 0, update immediately.
     */
    public void set(double speed, byte syncGroup) {
        setSpeed(speed);
    }

    /**
     * Set the PWM value.
     *
     * The PWM value is set using a range of -1.0 to 1.0, appropriately
     * scaling the value for the FPGA.
     *
     * @param speed The speed value between -1.0 and 1.0 to set.
     */
    public void set(double speed) {
        setSpeed(speed);
    }

    /**
     * Get the recently set value of the PWM.
     *
     * @return The most recently set value for the PWM between -1.0 and 1.0.
     */
    public double get() {
        return getSpeed();
    }

    /**
     * Write out the PID value as seen in the PIDOutput base object.
     *
     * @param output Write out the PWM value as was found in the PIDController
     */
    public void pidWrite(double output) {
        set(output);
    }
}

