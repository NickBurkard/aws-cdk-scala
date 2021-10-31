package io.burkard.cdk.customresources

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object SdkCallsPolicyOptions {

  def apply(
    resources: Option[List[String]] = None
  ): software.amazon.awscdk.customresources.SdkCallsPolicyOptions =
    (new software.amazon.awscdk.customresources.SdkCallsPolicyOptions.Builder)
      .resources(resources.map(_.asJava).orNull)
      .build()
}
