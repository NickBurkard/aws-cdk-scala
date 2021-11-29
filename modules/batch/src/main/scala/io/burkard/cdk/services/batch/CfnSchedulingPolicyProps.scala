package io.burkard.cdk.services.batch

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnSchedulingPolicyProps {

  def apply(
    name: Option[String] = None,
    fairsharePolicy: Option[software.amazon.awscdk.services.batch.CfnSchedulingPolicy.FairsharePolicyProperty] = None,
    tags: Option[Map[String, String]] = None
  ): software.amazon.awscdk.services.batch.CfnSchedulingPolicyProps =
    (new software.amazon.awscdk.services.batch.CfnSchedulingPolicyProps.Builder)
      .name(name.orNull)
      .fairsharePolicy(fairsharePolicy.orNull)
      .tags(tags.map(_.asJava).orNull)
      .build()
}
