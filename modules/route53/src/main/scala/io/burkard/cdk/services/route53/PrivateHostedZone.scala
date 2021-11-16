package io.burkard.cdk.services.route53

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object PrivateHostedZone {

  def apply(
    internalResourceId: String,
    vpc: software.amazon.awscdk.services.ec2.IVpc,
    queryLogsLogGroupArn: Option[String] = None,
    zoneName: Option[String] = None,
    comment: Option[String] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.route53.PrivateHostedZone =
    software.amazon.awscdk.services.route53.PrivateHostedZone.Builder
      .create(stackCtx, internalResourceId)
      .vpc(vpc)
      .queryLogsLogGroupArn(queryLogsLogGroupArn.orNull)
      .zoneName(zoneName.orNull)
      .comment(comment.orNull)
      .build()
}
