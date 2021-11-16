package io.burkard.cdk.services.imagebuilder

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnDistributionConfigurationProps {

  def apply(
    name: String,
    distributions: List[_],
    description: Option[String] = None,
    tags: Option[Map[String, String]] = None
  ): software.amazon.awscdk.services.imagebuilder.CfnDistributionConfigurationProps =
    (new software.amazon.awscdk.services.imagebuilder.CfnDistributionConfigurationProps.Builder)
      .name(name)
      .distributions(distributions.asJava)
      .description(description.orNull)
      .tags(tags.map(_.asJava).orNull)
      .build()
}
