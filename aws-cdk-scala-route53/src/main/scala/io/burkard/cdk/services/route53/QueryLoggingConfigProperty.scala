package io.burkard.cdk.services.route53

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object QueryLoggingConfigProperty {

  def apply(
    cloudWatchLogsLogGroupArn: Option[String] = None
  ): software.amazon.awscdk.services.route53.CfnHostedZone.QueryLoggingConfigProperty =
    (new software.amazon.awscdk.services.route53.CfnHostedZone.QueryLoggingConfigProperty.Builder)
      .cloudWatchLogsLogGroupArn(cloudWatchLogsLogGroupArn.orNull)
      .build()
}
