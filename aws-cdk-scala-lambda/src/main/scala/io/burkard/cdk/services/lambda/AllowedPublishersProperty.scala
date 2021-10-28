package io.burkard.cdk.services.lambda

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object AllowedPublishersProperty {

  def apply(
    signingProfileVersionArns: Option[List[String]] = None
  ): software.amazon.awscdk.services.lambda.CfnCodeSigningConfig.AllowedPublishersProperty =
    (new software.amazon.awscdk.services.lambda.CfnCodeSigningConfig.AllowedPublishersProperty.Builder)
      .signingProfileVersionArns(signingProfileVersionArns.map(_.asJava).orNull)
      .build()
}
