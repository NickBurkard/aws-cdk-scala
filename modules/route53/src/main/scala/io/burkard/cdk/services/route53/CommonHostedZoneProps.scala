package io.burkard.cdk.services.route53

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CommonHostedZoneProps {

  def apply(
    zoneName: String,
    queryLogsLogGroupArn: Option[String] = None,
    comment: Option[String] = None
  ): software.amazon.awscdk.services.route53.CommonHostedZoneProps =
    (new software.amazon.awscdk.services.route53.CommonHostedZoneProps.Builder)
      .zoneName(zoneName)
      .queryLogsLogGroupArn(queryLogsLogGroupArn.orNull)
      .comment(comment.orNull)
      .build()
}
