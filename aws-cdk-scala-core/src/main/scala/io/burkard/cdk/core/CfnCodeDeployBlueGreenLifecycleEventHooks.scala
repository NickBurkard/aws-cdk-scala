package io.burkard.cdk.core

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnCodeDeployBlueGreenLifecycleEventHooks {

  def apply(
    afterAllowTraffic: Option[String] = None,
    beforeInstall: Option[String] = None,
    afterAllowTestTraffic: Option[String] = None,
    beforeAllowTraffic: Option[String] = None,
    afterInstall: Option[String] = None
  ): software.amazon.awscdk.CfnCodeDeployBlueGreenLifecycleEventHooks =
    (new software.amazon.awscdk.CfnCodeDeployBlueGreenLifecycleEventHooks.Builder)
      .afterAllowTraffic(afterAllowTraffic.orNull)
      .beforeInstall(beforeInstall.orNull)
      .afterAllowTestTraffic(afterAllowTestTraffic.orNull)
      .beforeAllowTraffic(beforeAllowTraffic.orNull)
      .afterInstall(afterInstall.orNull)
      .build()
}
