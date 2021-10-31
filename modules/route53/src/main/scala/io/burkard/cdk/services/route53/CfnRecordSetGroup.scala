package io.burkard.cdk.services.route53

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnRecordSetGroup {

  def apply(
    internalResourceId: String,
    recordSets: Option[List[_]] = None,
    hostedZoneId: Option[String] = None,
    hostedZoneName: Option[String] = None,
    comment: Option[String] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.route53.CfnRecordSetGroup =
    software.amazon.awscdk.services.route53.CfnRecordSetGroup.Builder
      .create(stackCtx, internalResourceId)
      .recordSets(recordSets.map(_.asJava).orNull)
      .hostedZoneId(hostedZoneId.orNull)
      .hostedZoneName(hostedZoneName.orNull)
      .comment(comment.orNull)
      .build()
}
