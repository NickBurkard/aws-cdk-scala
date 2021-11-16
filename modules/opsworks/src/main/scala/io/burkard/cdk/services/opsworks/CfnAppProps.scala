package io.burkard.cdk.services.opsworks

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnAppProps {

  def apply(
    name: String,
    stackId: String,
    `type`: String,
    sslConfiguration: Option[software.amazon.awscdk.services.opsworks.CfnApp.SslConfigurationProperty] = None,
    shortname: Option[String] = None,
    description: Option[String] = None,
    domains: Option[List[String]] = None,
    attributes: Option[Map[String, String]] = None,
    appSource: Option[software.amazon.awscdk.services.opsworks.CfnApp.SourceProperty] = None,
    environment: Option[List[_]] = None,
    enableSsl: Option[Boolean] = None,
    dataSources: Option[List[_]] = None
  ): software.amazon.awscdk.services.opsworks.CfnAppProps =
    (new software.amazon.awscdk.services.opsworks.CfnAppProps.Builder)
      .name(name)
      .stackId(stackId)
      .`type`(`type`)
      .sslConfiguration(sslConfiguration.orNull)
      .shortname(shortname.orNull)
      .description(description.orNull)
      .domains(domains.map(_.asJava).orNull)
      .attributes(attributes.map(_.asJava).orNull)
      .appSource(appSource.orNull)
      .environment(environment.map(_.asJava).orNull)
      .enableSsl(enableSsl.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .dataSources(dataSources.map(_.asJava).orNull)
      .build()
}
