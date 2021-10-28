package io.burkard.cdk.services.route53

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object PrivateHostedZone {

  def apply(
    internalResourceId: String,
    queryLogsLogGroupArn: Option[String] = None,
    zoneName: Option[String] = None,
    comment: Option[String] = None,
    vpc: Option[software.amazon.awscdk.services.ec2.IVpc] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.route53.PrivateHostedZone =
    software.amazon.awscdk.services.route53.PrivateHostedZone.Builder
      .create(stackCtx, internalResourceId)
      .queryLogsLogGroupArn(queryLogsLogGroupArn.orNull)
      .zoneName(zoneName.orNull)
      .comment(comment.orNull)
      .vpc(vpc.orNull)
      .build()
}
