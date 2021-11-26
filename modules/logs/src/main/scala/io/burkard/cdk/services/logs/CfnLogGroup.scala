package io.burkard.cdk.services.logs

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnLogGroup {

  def apply(
    internalResourceId: String,
    tags: Option[List[_ <: software.amazon.awscdk.CfnTag]] = None,
    kmsKeyId: Option[String] = None,
    retentionInDays: Option[Number] = None,
    logGroupName: Option[String] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.logs.CfnLogGroup =
    software.amazon.awscdk.services.logs.CfnLogGroup.Builder
      .create(stackCtx, internalResourceId)
      .tags(tags.map(_.asJava).orNull)
      .kmsKeyId(kmsKeyId.orNull)
      .retentionInDays(retentionInDays.orNull)
      .logGroupName(logGroupName.orNull)
      .build()
}
