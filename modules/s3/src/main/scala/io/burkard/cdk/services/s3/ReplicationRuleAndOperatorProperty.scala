package io.burkard.cdk.services.s3

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object ReplicationRuleAndOperatorProperty {

  def apply(
    tagFilters: Option[List[_]] = None,
    prefix: Option[String] = None
  ): software.amazon.awscdk.services.s3.CfnBucket.ReplicationRuleAndOperatorProperty =
    (new software.amazon.awscdk.services.s3.CfnBucket.ReplicationRuleAndOperatorProperty.Builder)
      .tagFilters(tagFilters.map(_.asJava).orNull)
      .prefix(prefix.orNull)
      .build()
}
