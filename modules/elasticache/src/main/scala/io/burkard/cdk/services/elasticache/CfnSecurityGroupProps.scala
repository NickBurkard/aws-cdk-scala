package io.burkard.cdk.services.elasticache

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnSecurityGroupProps {

  def apply(
    description: Option[String] = None,
    tags: Option[List[_ <: software.amazon.awscdk.CfnTag]] = None
  ): software.amazon.awscdk.services.elasticache.CfnSecurityGroupProps =
    (new software.amazon.awscdk.services.elasticache.CfnSecurityGroupProps.Builder)
      .description(description.orNull)
      .tags(tags.map(_.asJava).orNull)
      .build()
}
