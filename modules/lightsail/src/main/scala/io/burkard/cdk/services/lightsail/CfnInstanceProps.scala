package io.burkard.cdk.services.lightsail

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnInstanceProps {

  def apply(
    bundleId: String,
    blueprintId: String,
    instanceName: String,
    location: Option[software.amazon.awscdk.services.lightsail.CfnInstance.LocationProperty] = None,
    state: Option[software.amazon.awscdk.services.lightsail.CfnInstance.StateProperty] = None,
    addOns: Option[List[_]] = None,
    tags: Option[List[_ <: software.amazon.awscdk.CfnTag]] = None,
    userData: Option[String] = None,
    hardware: Option[software.amazon.awscdk.services.lightsail.CfnInstance.HardwareProperty] = None,
    keyPairName: Option[String] = None,
    availabilityZone: Option[String] = None,
    networking: Option[software.amazon.awscdk.services.lightsail.CfnInstance.NetworkingProperty] = None
  ): software.amazon.awscdk.services.lightsail.CfnInstanceProps =
    (new software.amazon.awscdk.services.lightsail.CfnInstanceProps.Builder)
      .bundleId(bundleId)
      .blueprintId(blueprintId)
      .instanceName(instanceName)
      .location(location.orNull)
      .state(state.orNull)
      .addOns(addOns.map(_.asJava).orNull)
      .tags(tags.map(_.asJava).orNull)
      .userData(userData.orNull)
      .hardware(hardware.orNull)
      .keyPairName(keyPairName.orNull)
      .availabilityZone(availabilityZone.orNull)
      .networking(networking.orNull)
      .build()
}
