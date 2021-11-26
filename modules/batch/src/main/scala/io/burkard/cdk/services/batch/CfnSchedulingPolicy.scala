package io.burkard.cdk.services.batch

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnSchedulingPolicy {

  def apply(
    internalResourceId: String,
    name: Option[String] = None,
    fairsharePolicy: Option[software.amazon.awscdk.services.batch.CfnSchedulingPolicy.FairsharePolicyProperty] = None,
    tags: Option[Map[String, String]] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.batch.CfnSchedulingPolicy =
    software.amazon.awscdk.services.batch.CfnSchedulingPolicy.Builder
      .create(stackCtx, internalResourceId)
      .name(name.orNull)
      .fairsharePolicy(fairsharePolicy.orNull)
      .tags(tags.map(_.asJava).orNull)
      .build()
}
