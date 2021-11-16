package io.burkard.cdk.services.route53

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object PrivateHostedZoneProps {

  def apply(
    vpc: software.amazon.awscdk.services.ec2.IVpc,
    queryLogsLogGroupArn: Option[String] = None,
    zoneName: Option[String] = None,
    comment: Option[String] = None
  ): software.amazon.awscdk.services.route53.PrivateHostedZoneProps =
    (new software.amazon.awscdk.services.route53.PrivateHostedZoneProps.Builder)
      .vpc(vpc)
      .queryLogsLogGroupArn(queryLogsLogGroupArn.orNull)
      .zoneName(zoneName.orNull)
      .comment(comment.orNull)
      .build()
}
