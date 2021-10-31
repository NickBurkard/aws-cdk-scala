package io.burkard.cdk.services.lambda

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object AllowedPublishersProperty {

  def apply(
    signingProfileVersionArns: Option[List[String]] = None
  ): software.amazon.awscdk.services.lambda.CfnCodeSigningConfig.AllowedPublishersProperty =
    (new software.amazon.awscdk.services.lambda.CfnCodeSigningConfig.AllowedPublishersProperty.Builder)
      .signingProfileVersionArns(signingProfileVersionArns.map(_.asJava).orNull)
      .build()
}
