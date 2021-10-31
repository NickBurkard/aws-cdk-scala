package io.burkard.cdk.services.servicecatalog

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
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
