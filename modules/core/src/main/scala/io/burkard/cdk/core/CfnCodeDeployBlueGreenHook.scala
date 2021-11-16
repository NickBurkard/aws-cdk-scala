package io.burkard.cdk.core

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnCodeDeployBlueGreenHook {

  def apply(
    internalResourceId: String,
    applications: List[_ <: software.amazon.awscdk.CfnCodeDeployBlueGreenApplication],
    serviceRole: String,
    trafficRoutingConfig: Option[software.amazon.awscdk.CfnTrafficRoutingConfig] = None,
    additionalOptions: Option[software.amazon.awscdk.CfnCodeDeployBlueGreenAdditionalOptions] = None,
    lifecycleEventHooks: Option[software.amazon.awscdk.CfnCodeDeployBlueGreenLifecycleEventHooks] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.CfnCodeDeployBlueGreenHook =
    software.amazon.awscdk.CfnCodeDeployBlueGreenHook.Builder
      .create(stackCtx, internalResourceId)
      .applications(applications.asJava)
      .serviceRole(serviceRole)
      .trafficRoutingConfig(trafficRoutingConfig.orNull)
      .additionalOptions(additionalOptions.orNull)
      .lifecycleEventHooks(lifecycleEventHooks.orNull)
      .build()
}
