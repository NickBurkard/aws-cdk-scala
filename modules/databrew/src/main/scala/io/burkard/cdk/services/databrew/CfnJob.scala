package io.burkard.cdk.services.databrew

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnJob {

  def apply(
    internalResourceId: String,
    recipe: Option[AnyRef] = None,
    jobSample: Option[software.amazon.awscdk.services.databrew.CfnJob.JobSampleProperty] = None,
    tags: Option[List[_ <: software.amazon.awscdk.CfnTag]] = None,
    outputs: Option[List[_]] = None,
    profileConfiguration: Option[software.amazon.awscdk.services.databrew.CfnJob.ProfileConfigurationProperty] = None,
    databaseOutputs: Option[List[_]] = None,
    encryptionKeyArn: Option[String] = None,
    encryptionMode: Option[String] = None,
    outputLocation: Option[software.amazon.awscdk.services.databrew.CfnJob.OutputLocationProperty] = None,
    `type`: Option[String] = None,
    timeout: Option[Number] = None,
    projectName: Option[String] = None,
    maxCapacity: Option[Number] = None,
    name: Option[String] = None,
    dataCatalogOutputs: Option[List[_]] = None,
    logSubscription: Option[String] = None,
    datasetName: Option[String] = None,
    roleArn: Option[String] = None,
    maxRetries: Option[Number] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.databrew.CfnJob =
    software.amazon.awscdk.services.databrew.CfnJob.Builder
      .create(stackCtx, internalResourceId)
      .recipe(recipe.orNull)
      .jobSample(jobSample.orNull)
      .tags(tags.map(_.asJava).orNull)
      .outputs(outputs.map(_.asJava).orNull)
      .profileConfiguration(profileConfiguration.orNull)
      .databaseOutputs(databaseOutputs.map(_.asJava).orNull)
      .encryptionKeyArn(encryptionKeyArn.orNull)
      .encryptionMode(encryptionMode.orNull)
      .outputLocation(outputLocation.orNull)
      .`type`(`type`.orNull)
      .timeout(timeout.orNull)
      .projectName(projectName.orNull)
      .maxCapacity(maxCapacity.orNull)
      .name(name.orNull)
      .dataCatalogOutputs(dataCatalogOutputs.map(_.asJava).orNull)
      .logSubscription(logSubscription.orNull)
      .datasetName(datasetName.orNull)
      .roleArn(roleArn.orNull)
      .maxRetries(maxRetries.orNull)
      .build()
}
