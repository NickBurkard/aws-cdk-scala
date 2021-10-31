package io.burkard.cdk.services.route53

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnRecordSetGroupProps {

  def apply(
    recordSets: Option[List[_]] = None,
    hostedZoneId: Option[String] = None,
    hostedZoneName: Option[String] = None,
    comment: Option[String] = None
  ): software.amazon.awscdk.services.route53.CfnRecordSetGroupProps =
    (new software.amazon.awscdk.services.route53.CfnRecordSetGroupProps.Builder)
      .recordSets(recordSets.map(_.asJava).orNull)
      .hostedZoneId(hostedZoneId.orNull)
      .hostedZoneName(hostedZoneName.orNull)
      .comment(comment.orNull)
      .build()
}
