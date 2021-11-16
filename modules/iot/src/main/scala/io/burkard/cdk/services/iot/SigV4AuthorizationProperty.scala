package io.burkard.cdk.services.iot

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object SigV4AuthorizationProperty {

  def apply(
    signingRegion: String,
    serviceName: String,
    roleArn: String
  ): software.amazon.awscdk.services.iot.CfnTopicRule.SigV4AuthorizationProperty =
    (new software.amazon.awscdk.services.iot.CfnTopicRule.SigV4AuthorizationProperty.Builder)
      .signingRegion(signingRegion)
      .serviceName(serviceName)
      .roleArn(roleArn)
      .build()
}
