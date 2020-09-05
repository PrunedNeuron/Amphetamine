package com.ayushm.icons.amphetamine

import com.github.javiersantos.piracychecker.PiracyChecker
import com.ayushm.icons.amphetamine.R
import dev.jahir.blueprint.ui.activities.BottomNavigationBlueprintActivity

class MainActivity : BottomNavigationBlueprintActivity() {

    /**
     * These things here have the default values. You can delete the ones you don't want to change
     * and/or modify the ones you want to.
     */
    override val billingEnabled = true

    override fun amazonInstallsEnabled(): Boolean = false
    override fun checkLPF(): Boolean = false
    override fun checkStores(): Boolean = false
    override val isDebug: Boolean = BuildConfig.DEBUG

    /**
     * This is your app's license key. Get yours on Google Play Dev Console.
     * Default one isn't valid and could cause issues in your app.
     */
    override fun getLicKey(): String? = "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAtBM338uomDGsoOF8UvVviH4RSUwx/QSDx9+0MLlL1z716j5MnkzrVpaV3sh7bjQB5PpQW5FMbEU+sjYmeKyrXcLApDPvn3qixRSisPdfpitRgMEYIWDnsYSbm87fLueUwFrlk25TKfFC5u10Lq7M1DQTOwVn1yAPNZ/59bUU8w7XRdgMOr8+GUJJquYUiwRR5sg2uisTMcJGssfYZo+AQOaogmrrAHa6LZy6pRrdj4Lj/uz/QC3d0uPkdCtrA7f0EtHlhWtyzyNYZY6mx8/XbNMr1aaVkft19uffv8F8AQt1szkE0VN7DLpWFVuQLcWeQ0W2nzH5E5fzrv8PDgG3vQIDAQAB"

    /**
     * This is the license checker code. Feel free to create your own implementation or
     * leave it as it is.
     * Anyways, keep the 'destroyChecker()' as the very first line of this code block
     * Return null to disable license check
     */
    override fun getLicenseChecker(): PiracyChecker? {
        destroyChecker() // Important
        return null // Just for CI purposes
        // return if (BuildConfig.DEBUG) null
        // else super.getLicenseChecker()
    }

    override fun defaultTheme(): Int = R.style.MyApp_Default
    override fun amoledTheme(): Int = R.style.MyApp_Default_Amoled
}