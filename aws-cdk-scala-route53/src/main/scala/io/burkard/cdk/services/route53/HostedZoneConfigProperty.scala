package io.burkard.cdk.services.route53

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object HostedZoneConfigProperty {

  def apply(
    comment: Option[String] = None
  ): software.amazon.awscdk.services.route53.CfnHostedZone.HostedZoneConfigProperty =
    (new software.amazon.awscdk.services.route53.CfnHostedZone.HostedZoneConfigProperty.Builder)
      .comment(comment.orNull)
      .build()
}
