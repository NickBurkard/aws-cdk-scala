package io.burkard.cdk.services.s3

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object LifecycleConfigurationProperty {

  def apply(
    rules: Option[List[_]] = None
  ): software.amazon.awscdk.services.s3.CfnBucket.LifecycleConfigurationProperty =
    (new software.amazon.awscdk.services.s3.CfnBucket.LifecycleConfigurationProperty.Builder)
      .rules(rules.map(_.asJava).orNull)
      .build()
}
