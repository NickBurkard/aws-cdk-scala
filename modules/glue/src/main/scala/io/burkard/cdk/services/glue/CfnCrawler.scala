package io.burkard.cdk.services.glue

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnCrawler {

  def apply(
    internalResourceId: String,
    targets: software.amazon.awscdk.services.glue.CfnCrawler.TargetsProperty,
    role: String,
    schemaChangePolicy: Option[software.amazon.awscdk.services.glue.CfnCrawler.SchemaChangePolicyProperty] = None,
    recrawlPolicy: Option[software.amazon.awscdk.services.glue.CfnCrawler.RecrawlPolicyProperty] = None,
    schedule: Option[software.amazon.awscdk.services.glue.CfnCrawler.ScheduleProperty] = None,
    databaseName: Option[String] = None,
    name: Option[String] = None,
    crawlerSecurityConfiguration: Option[String] = None,
    tablePrefix: Option[String] = None,
    description: Option[String] = None,
    tags: Option[AnyRef] = None,
    configuration: Option[String] = None,
    classifiers: Option[List[String]] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.glue.CfnCrawler =
    software.amazon.awscdk.services.glue.CfnCrawler.Builder
      .create(stackCtx, internalResourceId)
      .targets(targets)
      .role(role)
      .schemaChangePolicy(schemaChangePolicy.orNull)
      .recrawlPolicy(recrawlPolicy.orNull)
      .schedule(schedule.orNull)
      .databaseName(databaseName.orNull)
      .name(name.orNull)
      .crawlerSecurityConfiguration(crawlerSecurityConfiguration.orNull)
      .tablePrefix(tablePrefix.orNull)
      .description(description.orNull)
      .tags(tags.orNull)
      .configuration(configuration.orNull)
      .classifiers(classifiers.map(_.asJava).orNull)
      .build()
}
