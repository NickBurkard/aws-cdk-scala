package io.burkard.cdk.services.batch

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object LogConfigurationProperty {

  def apply(
    logDriver: String,
    secretOptions: Option[List[_]] = None,
    options: Option[AnyRef] = None
  ): software.amazon.awscdk.services.batch.CfnJobDefinition.LogConfigurationProperty =
    (new software.amazon.awscdk.services.batch.CfnJobDefinition.LogConfigurationProperty.Builder)
      .logDriver(logDriver)
      .secretOptions(secretOptions.map(_.asJava).orNull)
      .options(options.orNull)
      .build()
}
