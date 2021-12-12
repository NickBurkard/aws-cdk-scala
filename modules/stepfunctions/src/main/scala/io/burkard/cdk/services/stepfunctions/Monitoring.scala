package io.burkard.cdk.services.stepfunctions

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object Monitoring {

  def apply(
    logGroup: Option[software.amazon.awscdk.services.logs.ILogGroup] = None,
    logging: Option[Boolean] = None,
    logStreamNamePrefix: Option[String] = None,
    logBucket: Option[software.amazon.awscdk.services.s3.IBucket] = None,
    persistentAppUi: Option[Boolean] = None
  ): software.amazon.awscdk.services.stepfunctions.tasks.Monitoring =
    (new software.amazon.awscdk.services.stepfunctions.tasks.Monitoring.Builder)
      .logGroup(logGroup.orNull)
      .logging(logging.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .logStreamNamePrefix(logStreamNamePrefix.orNull)
      .logBucket(logBucket.orNull)
      .persistentAppUi(persistentAppUi.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .build()
}
