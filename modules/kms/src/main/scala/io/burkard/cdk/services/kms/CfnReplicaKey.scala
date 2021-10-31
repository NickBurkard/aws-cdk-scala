package io.burkard.cdk.services.kms

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnReplicaKey {

  def apply(
    internalResourceId: String,
    pendingWindowInDays: Option[Number] = None,
    enabled: Option[Boolean] = None,
    primaryKeyArn: Option[String] = None,
    keyPolicy: Option[AnyRef] = None,
    description: Option[String] = None,
    tags: Option[List[_ <: software.amazon.awscdk.CfnTag]] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.kms.CfnReplicaKey =
    software.amazon.awscdk.services.kms.CfnReplicaKey.Builder
      .create(stackCtx, internalResourceId)
      .pendingWindowInDays(pendingWindowInDays.orNull)
      .enabled(enabled.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .primaryKeyArn(primaryKeyArn.orNull)
      .keyPolicy(keyPolicy.orNull)
      .description(description.orNull)
      .tags(tags.map(_.asJava).orNull)
      .build()
}
