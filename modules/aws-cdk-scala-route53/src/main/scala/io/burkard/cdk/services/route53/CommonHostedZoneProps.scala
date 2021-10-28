package io.burkard.cdk.services.route53

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CommonHostedZoneProps {

  def apply(
    queryLogsLogGroupArn: Option[String] = None,
    zoneName: Option[String] = None,
    comment: Option[String] = None
  ): software.amazon.awscdk.services.route53.CommonHostedZoneProps =
    (new software.amazon.awscdk.services.route53.CommonHostedZoneProps.Builder)
      .queryLogsLogGroupArn(queryLogsLogGroupArn.orNull)
      .zoneName(zoneName.orNull)
      .comment(comment.orNull)
      .build()
}
