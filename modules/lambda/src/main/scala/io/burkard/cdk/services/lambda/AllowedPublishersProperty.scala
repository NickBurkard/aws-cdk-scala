package io.burkard.cdk.services.lambda

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object AllowedPublishersProperty {

  def apply(
    signingProfileVersionArns: List[String]
  ): software.amazon.awscdk.services.lambda.CfnCodeSigningConfig.AllowedPublishersProperty =
    (new software.amazon.awscdk.services.lambda.CfnCodeSigningConfig.AllowedPublishersProperty.Builder)
      .signingProfileVersionArns(signingProfileVersionArns.asJava)
      .build()
}
