package io.burkard.cdk.services.batch

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object LogConfigurationProperty {

  def apply(
    secretOptions: Option[List[_]] = None,
    logDriver: Option[String] = None,
    options: Option[AnyRef] = None
  ): software.amazon.awscdk.services.batch.CfnJobDefinition.LogConfigurationProperty =
    (new software.amazon.awscdk.services.batch.CfnJobDefinition.LogConfigurationProperty.Builder)
      .secretOptions(secretOptions.map(_.asJava).orNull)
      .logDriver(logDriver.orNull)
      .options(options.orNull)
      .build()
}
