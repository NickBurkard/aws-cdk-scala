package io.burkard.cdk.services.elasticbeanstalk

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object TierProperty {

  def apply(
    name: Option[String] = None,
    version: Option[String] = None,
    `type`: Option[String] = None
  ): software.amazon.awscdk.services.elasticbeanstalk.CfnEnvironment.TierProperty =
    (new software.amazon.awscdk.services.elasticbeanstalk.CfnEnvironment.TierProperty.Builder)
      .name(name.orNull)
      .version(version.orNull)
      .`type`(`type`.orNull)
      .build()
}
