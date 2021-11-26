package io.burkard.cdk.services.logs

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnLogGroupProps {

  def apply(
    tags: Option[List[_ <: software.amazon.awscdk.CfnTag]] = None,
    kmsKeyId: Option[String] = None,
    retentionInDays: Option[Number] = None,
    logGroupName: Option[String] = None
  ): software.amazon.awscdk.services.logs.CfnLogGroupProps =
    (new software.amazon.awscdk.services.logs.CfnLogGroupProps.Builder)
      .tags(tags.map(_.asJava).orNull)
      .kmsKeyId(kmsKeyId.orNull)
      .retentionInDays(retentionInDays.orNull)
      .logGroupName(logGroupName.orNull)
      .build()
}
