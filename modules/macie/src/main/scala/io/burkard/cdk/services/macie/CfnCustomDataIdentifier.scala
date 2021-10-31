package io.burkard.cdk.services.macie

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnCustomDataIdentifier {

  def apply(
    internalResourceId: String,
    regex: Option[String] = None,
    name: Option[String] = None,
    description: Option[String] = None,
    maximumMatchDistance: Option[Number] = None,
    keywords: Option[List[String]] = None,
    ignoreWords: Option[List[String]] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.macie.CfnCustomDataIdentifier =
    software.amazon.awscdk.services.macie.CfnCustomDataIdentifier.Builder
      .create(stackCtx, internalResourceId)
      .regex(regex.orNull)
      .name(name.orNull)
      .description(description.orNull)
      .maximumMatchDistance(maximumMatchDistance.orNull)
      .keywords(keywords.map(_.asJava).orNull)
      .ignoreWords(ignoreWords.map(_.asJava).orNull)
      .build()
}
