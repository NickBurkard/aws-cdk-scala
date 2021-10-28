package io.burkard.cdk.services.imagebuilder

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnDistributionConfigurationProps {

  def apply(
    name: Option[String] = None,
    distributions: Option[List[_]] = None,
    description: Option[String] = None,
    tags: Option[Map[String, String]] = None
  ): software.amazon.awscdk.services.imagebuilder.CfnDistributionConfigurationProps =
    (new software.amazon.awscdk.services.imagebuilder.CfnDistributionConfigurationProps.Builder)
      .name(name.orNull)
      .distributions(distributions.map(_.asJava).orNull)
      .description(description.orNull)
      .tags(tags.map(_.asJava).orNull)
      .build()
}
