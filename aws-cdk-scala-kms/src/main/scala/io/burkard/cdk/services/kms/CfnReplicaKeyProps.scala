package io.burkard.cdk.services.kms

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnReplicaKeyProps {

  def apply(
    pendingWindowInDays: Option[Number] = None,
    enabled: Option[Boolean] = None,
    primaryKeyArn: Option[String] = None,
    keyPolicy: Option[AnyRef] = None,
    description: Option[String] = None,
    tags: Option[List[_ <: software.amazon.awscdk.CfnTag]] = None
  ): software.amazon.awscdk.services.kms.CfnReplicaKeyProps =
    (new software.amazon.awscdk.services.kms.CfnReplicaKeyProps.Builder)
      .pendingWindowInDays(pendingWindowInDays.orNull)
      .enabled(enabled.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .primaryKeyArn(primaryKeyArn.orNull)
      .keyPolicy(keyPolicy.orNull)
      .description(description.orNull)
      .tags(tags.map(_.asJava).orNull)
      .build()
}
