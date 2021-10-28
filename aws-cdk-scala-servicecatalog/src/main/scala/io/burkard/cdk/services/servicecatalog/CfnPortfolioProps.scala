package io.burkard.cdk.services.servicecatalog

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnPortfolioProps {

  def apply(
    displayName: Option[String] = None,
    acceptLanguage: Option[String] = None,
    providerName: Option[String] = None,
    description: Option[String] = None,
    tags: Option[List[_ <: software.amazon.awscdk.CfnTag]] = None
  ): software.amazon.awscdk.services.servicecatalog.CfnPortfolioProps =
    (new software.amazon.awscdk.services.servicecatalog.CfnPortfolioProps.Builder)
      .displayName(displayName.orNull)
      .acceptLanguage(acceptLanguage.orNull)
      .providerName(providerName.orNull)
      .description(description.orNull)
      .tags(tags.map(_.asJava).orNull)
      .build()
}
