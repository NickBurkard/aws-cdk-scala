package io.burkard.cdk.customresources

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object SdkCallsPolicyOptions {

  def apply(
    resources: List[String]
  ): software.amazon.awscdk.customresources.SdkCallsPolicyOptions =
    (new software.amazon.awscdk.customresources.SdkCallsPolicyOptions.Builder)
      .resources(resources.asJava)
      .build()
}
