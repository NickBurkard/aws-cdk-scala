package io.burkard.cdk.services.datasync

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnTask {

  def apply(
    internalResourceId: String,
    sourceLocationArn: String,
    destinationLocationArn: String,
    name: Option[String] = None,
    tags: Option[List[_ <: software.amazon.awscdk.CfnTag]] = None,
    excludes: Option[List[_]] = None,
    options: Option[software.amazon.awscdk.services.datasync.CfnTask.OptionsProperty] = None,
    cloudWatchLogGroupArn: Option[String] = None,
    schedule: Option[software.amazon.awscdk.services.datasync.CfnTask.TaskScheduleProperty] = None,
    includes: Option[List[_]] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.datasync.CfnTask =
    software.amazon.awscdk.services.datasync.CfnTask.Builder
      .create(stackCtx, internalResourceId)
      .sourceLocationArn(sourceLocationArn)
      .destinationLocationArn(destinationLocationArn)
      .name(name.orNull)
      .tags(tags.map(_.asJava).orNull)
      .excludes(excludes.map(_.asJava).orNull)
      .options(options.orNull)
      .cloudWatchLogGroupArn(cloudWatchLogGroupArn.orNull)
      .schedule(schedule.orNull)
      .includes(includes.map(_.asJava).orNull)
      .build()
}
