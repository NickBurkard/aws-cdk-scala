package io.burkard.cdk.services.servicecatalog

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnPortfolio {

  def apply(
    internalResourceId: String,
    displayName: Option[String] = None,
    acceptLanguage: Option[String] = None,
    providerName: Option[String] = None,
    description: Option[String] = None,
    tags: Option[List[_ <: software.amazon.awscdk.CfnTag]] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.servicecatalog.CfnPortfolio =
    software.amazon.awscdk.services.servicecatalog.CfnPortfolio.Builder
      .create(stackCtx, internalResourceId)
      .displayName(displayName.orNull)
      .acceptLanguage(acceptLanguage.orNull)
      .providerName(providerName.orNull)
      .description(description.orNull)
      .tags(tags.map(_.asJava).orNull)
      .build()
}
