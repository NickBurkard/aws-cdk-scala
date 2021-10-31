package io.burkard.cdk.services.route53

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object HostedZoneProps {

  def apply(
    queryLogsLogGroupArn: Option[String] = None,
    vpcs: Option[List[_ <: software.amazon.awscdk.services.ec2.IVpc]] = None,
    zoneName: Option[String] = None,
    comment: Option[String] = None
  ): software.amazon.awscdk.services.route53.HostedZoneProps =
    (new software.amazon.awscdk.services.route53.HostedZoneProps.Builder)
      .queryLogsLogGroupArn(queryLogsLogGroupArn.orNull)
      .vpcs(vpcs.map(_.asJava).orNull)
      .zoneName(zoneName.orNull)
      .comment(comment.orNull)
      .build()
}
