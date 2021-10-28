package io.burkard.cdk.services.s3

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
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
