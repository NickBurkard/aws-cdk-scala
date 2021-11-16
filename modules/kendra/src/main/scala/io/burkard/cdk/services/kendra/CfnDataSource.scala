package io.burkard.cdk.services.kendra

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnDataSource {

  def apply(
    internalResourceId: String,
    name: String,
    `type`: String,
    indexId: String,
    description: Option[String] = None,
    tags: Option[List[_ <: software.amazon.awscdk.CfnTag]] = None,
    roleArn: Option[String] = None,
    dataSourceConfiguration: Option[software.amazon.awscdk.services.kendra.CfnDataSource.DataSourceConfigurationProperty] = None,
    schedule: Option[String] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.kendra.CfnDataSource =
    software.amazon.awscdk.services.kendra.CfnDataSource.Builder
      .create(stackCtx, internalResourceId)
      .name(name)
      .`type`(`type`)
      .indexId(indexId)
      .description(description.orNull)
      .tags(tags.map(_.asJava).orNull)
      .roleArn(roleArn.orNull)
      .dataSourceConfiguration(dataSourceConfiguration.orNull)
      .schedule(schedule.orNull)
      .build()
}
