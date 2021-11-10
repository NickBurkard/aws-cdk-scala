package io.burkard.cdk.services.lightsail

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnInstanceProps {

  def apply(
    bundleId: Option[String] = None,
    location: Option[software.amazon.awscdk.services.lightsail.CfnInstance.LocationProperty] = None,
    state: Option[software.amazon.awscdk.services.lightsail.CfnInstance.StateProperty] = None,
    addOns: Option[List[_]] = None,
    tags: Option[List[_ <: software.amazon.awscdk.CfnTag]] = None,
    userData: Option[String] = None,
    hardware: Option[software.amazon.awscdk.services.lightsail.CfnInstance.HardwareProperty] = None,
    blueprintId: Option[String] = None,
    keyPairName: Option[String] = None,
    instanceName: Option[String] = None,
    availabilityZone: Option[String] = None,
    networking: Option[software.amazon.awscdk.services.lightsail.CfnInstance.NetworkingProperty] = None
  ): software.amazon.awscdk.services.lightsail.CfnInstanceProps =
    (new software.amazon.awscdk.services.lightsail.CfnInstanceProps.Builder)
      .bundleId(bundleId.orNull)
      .location(location.orNull)
      .state(state.orNull)
      .addOns(addOns.map(_.asJava).orNull)
      .tags(tags.map(_.asJava).orNull)
      .userData(userData.orNull)
      .hardware(hardware.orNull)
      .blueprintId(blueprintId.orNull)
      .keyPairName(keyPairName.orNull)
      .instanceName(instanceName.orNull)
      .availabilityZone(availabilityZone.orNull)
      .networking(networking.orNull)
      .build()
}
