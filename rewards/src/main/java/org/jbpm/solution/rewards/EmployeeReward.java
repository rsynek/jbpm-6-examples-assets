package org.jbpm.solution.rewards;

import java.lang.Object;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class EmployeeReward extends Object implements java.io.Serializable
{

   static final long serialVersionUID = 1L;

   @org.kie.api.definition.type.Position(2)
   private java.lang.Boolean pmAck;

   @org.kie.api.definition.type.Position(4)
   private java.lang.Boolean hrAck;

   @org.kie.api.definition.type.Position(6)
   private java.util.Date effectiveDate;

   @org.kie.api.definition.type.Position(value = 0)
   private java.lang.String recipient;

   @org.kie.api.definition.type.Position(value = 1)
   private java.lang.Integer reward;

   @org.kie.api.definition.type.Position(value = 3)
   private java.lang.String pmComment;

   @org.kie.api.definition.type.Position(value = 5)
   private java.lang.String hrComment;

   public java.lang.Boolean getPmAck()
   {
      return this.pmAck;
   }

   public void setPmAck(java.lang.Boolean pmAck)
   {
      this.pmAck = pmAck;
   }

   public java.lang.Boolean getHrAck()
   {
      return this.hrAck;
   }

   public void setHrAck(java.lang.Boolean hrAck)
   {
      this.hrAck = hrAck;
   }

   public java.util.Date getEffectiveDate()
   {
      return this.effectiveDate;
   }

   public void setEffectiveDate(java.util.Date effectiveDate)
   {
      this.effectiveDate = effectiveDate;
   }

   public java.lang.String getRecipient()
   {
      return this.recipient;
   }

   public void setRecipient(java.lang.String recipient)
   {
      this.recipient = recipient;
   }

   public java.lang.Integer getReward()
   {
      return this.reward;
   }

   public void setReward(java.lang.Integer reward)
   {
      this.reward = reward;
   }

   public java.lang.String getPmComment()
   {
      return this.pmComment;
   }

   public void setPmComment(java.lang.String pmComment)
   {
      this.pmComment = pmComment;
   }

   public java.lang.String getHrComment()
   {
      return this.hrComment;
   }

   public void setHrComment(java.lang.String hrComment)
   {
      this.hrComment = hrComment;
   }

   public EmployeeReward()
   {
   }

   public EmployeeReward(java.lang.String recipient, java.lang.Integer reward,
         java.lang.Boolean pmAck, java.lang.String pmComment,
         java.lang.Boolean hrAck, java.lang.String hrComment,
         java.util.Date effectiveDate)
   {
      this.recipient = recipient;
      this.reward = reward;
      this.pmAck = pmAck;
      this.pmComment = pmComment;
      this.hrAck = hrAck;
      this.hrComment = hrComment;
      this.effectiveDate = effectiveDate;
   }

}