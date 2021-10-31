package io.burkard.cdk.core

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnCodeDeployBlueGreenHook {

  def apply(
    internalResourceId: String,
    applications: Option[List[_ <: software.amazon.awscdk.CfnCodeDeployBlueGreenApplication]] = None,
    serviceRole: Option[String] = None,
    trafficRoutingConfig: Option[software.amazon.awscdk.CfnTrafficRoutingConfig] = None,
    additionalOptions: Option[software.amazon.awscdk.CfnCodeDeployBlueGreenAdditionalOptions] = None,
    lifecycleEventHooks: Option[software.amazon.awscdk.CfnCodeDeployBlueGreenLifecycleEventHooks] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.CfnCodeDeployBlueGreenHook =
    software.amazon.awscdk.CfnCodeDeployBlueGreenHook.Builder
      .create(stackCtx, internalResourceId)
      .applications(applications.map(_.asJava).orNull)
      .serviceRole(serviceRole.orNull)
      .trafficRoutingConfig(trafficRoutingConfig.orNull)
      .additionalOptions(additionalOptions.orNull)
      .lifecycleEventHooks(lifecycleEventHooks.orNull)
      .build()
}
