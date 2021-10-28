package io.burkard.cdk.services.config

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object SourceProperty {

  def apply(
    owner: Option[String] = None,
    sourceIdentifier: Option[String] = None,
    sourceDetails: Option[List[_]] = None
  ): software.amazon.awscdk.services.config.CfnConfigRule.SourceProperty =
    (new software.amazon.awscdk.services.config.CfnConfigRule.SourceProperty.Builder)
      .owner(owner.orNull)
      .sourceIdentifier(sourceIdentifier.orNull)
      .sourceDetails(sourceDetails.map(_.asJava).orNull)
      .build()
}
