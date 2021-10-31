package io.burkard.cdk.services.route53

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object HostedZone {

  def apply(
    internalResourceId: String,
    queryLogsLogGroupArn: Option[String] = None,
    vpcs: Option[List[_ <: software.amazon.awscdk.services.ec2.IVpc]] = None,
    zoneName: Option[String] = None,
    comment: Option[String] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.route53.HostedZone =
    software.amazon.awscdk.services.route53.HostedZone.Builder
      .create(stackCtx, internalResourceId)
      .queryLogsLogGroupArn(queryLogsLogGroupArn.orNull)
      .vpcs(vpcs.map(_.asJava).orNull)
      .zoneName(zoneName.orNull)
      .comment(comment.orNull)
      .build()
}
