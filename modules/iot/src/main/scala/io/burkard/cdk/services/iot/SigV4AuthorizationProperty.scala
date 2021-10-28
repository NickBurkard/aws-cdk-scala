package io.burkard.cdk.services.iot

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object SigV4AuthorizationProperty {

  def apply(
    signingRegion: Option[String] = None,
    serviceName: Option[String] = None,
    roleArn: Option[String] = None
  ): software.amazon.awscdk.services.iot.CfnTopicRule.SigV4AuthorizationProperty =
    (new software.amazon.awscdk.services.iot.CfnTopicRule.SigV4AuthorizationProperty.Builder)
      .signingRegion(signingRegion.orNull)
      .serviceName(serviceName.orNull)
      .roleArn(roleArn.orNull)
      .build()
}
