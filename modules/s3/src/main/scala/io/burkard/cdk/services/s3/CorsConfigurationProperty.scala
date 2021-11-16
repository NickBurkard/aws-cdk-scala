package io.burkard.cdk.services.s3

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CorsConfigurationProperty {

  def apply(
    corsRules: List[_]
  ): software.amazon.awscdk.services.s3.CfnBucket.CorsConfigurationProperty =
    (new software.amazon.awscdk.services.s3.CfnBucket.CorsConfigurationProperty.Builder)
      .corsRules(corsRules.asJava)
      .build()
}
