package io.burkard.cdk.services.kms

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnReplicaKeyProps {

  def apply(
    primaryKeyArn: String,
    keyPolicy: AnyRef,
    pendingWindowInDays: Option[Number] = None,
    enabled: Option[Boolean] = None,
    description: Option[String] = None,
    tags: Option[List[_ <: software.amazon.awscdk.CfnTag]] = None
  ): software.amazon.awscdk.services.kms.CfnReplicaKeyProps =
    (new software.amazon.awscdk.services.kms.CfnReplicaKeyProps.Builder)
      .primaryKeyArn(primaryKeyArn)
      .keyPolicy(keyPolicy)
      .pendingWindowInDays(pendingWindowInDays.orNull)
      .enabled(enabled.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .description(description.orNull)
      .tags(tags.map(_.asJava).orNull)
      .build()
}
