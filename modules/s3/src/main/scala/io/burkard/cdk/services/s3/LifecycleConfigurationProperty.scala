package io.burkard.cdk.services.s3

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object LifecycleConfigurationProperty {

  def apply(
    rules: Option[List[_]] = None
  ): software.amazon.awscdk.services.s3.CfnBucket.LifecycleConfigurationProperty =
    (new software.amazon.awscdk.services.s3.CfnBucket.LifecycleConfigurationProperty.Builder)
      .rules(rules.map(_.asJava).orNull)
      .build()
}