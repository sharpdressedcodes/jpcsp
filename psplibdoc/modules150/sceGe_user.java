/* This autogenerated file is part of jpcsp. */
/*
This file is part of jpcsp.

Jpcsp is free software: you can redistribute it and/or modify
it under the terms of the GNU General Public License as published by
the Free Software Foundation, either version 3 of the License, or
(at your option) any later version.

Jpcsp is distributed in the hope that it will be useful,
but WITHOUT ANY WARRANTY; without even the implied warranty of
MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
GNU General Public License for more details.

You should have received a copy of the GNU General Public License
along with Jpcsp.  If not, see <http://www.gnu.org/licenses/>.
 */

package jpcsp.HLE.modules150;

import jpcsp.HLE.modules.HLEModule;
import jpcsp.HLE.modules.HLEModuleFunction;
import jpcsp.HLE.modules.HLEModuleManager;

import jpcsp.Memory;
import jpcsp.Processor;

import jpcsp.Allegrex.CpuState; // New-Style Processor

public class sceGe_user implements HLEModule {
	@Override
	public String getName() { return "sceGe_user"; }
	
	@Override
	public void installModule(HLEModuleManager mm, int version) {
		if (version >= 150) {
		
			mm.addFunction(sceGeEdramGetSizeFunction, 0x1F6752AD);
			mm.addFunction(sceGeEdramGetAddrFunction, 0xE47E40E4);
			mm.addFunction(sceGeEdramSetAddrTranslationFunction, 0xB77905EA);
			mm.addFunction(sceGeGetCmdFunction, 0xDC93CFEF);
			mm.addFunction(sceGeGetMtxFunction, 0x57C8945B);
			mm.addFunction(sceGeSaveContextFunction, 0x438A385A);
			mm.addFunction(sceGeRestoreContextFunction, 0x0BF608FB);
			mm.addFunction(sceGeListEnQueueFunction, 0xAB49E76A);
			mm.addFunction(sceGeListEnQueueHeadFunction, 0x1C0D95A6);
			mm.addFunction(sceGeListDeQueueFunction, 0x5FB86AB0);
			mm.addFunction(sceGeListUpdateStallAddrFunction, 0xE0D68148);
			mm.addFunction(sceGeListSyncFunction, 0x03444EB4);
			mm.addFunction(sceGeDrawSyncFunction, 0xB287BD61);
			mm.addFunction(sceGeBreakFunction, 0xB448EC0D);
			mm.addFunction(sceGeContinueFunction, 0x4C06E472);
			mm.addFunction(sceGeSetCallbackFunction, 0xA4FC06A4);
			mm.addFunction(sceGeUnsetCallbackFunction, 0x05DB22CE);
			
		}
	}
	
	@Override
	public void uninstallModule(HLEModuleManager mm, int version) {
		if (version >= 150) {
		
			mm.removeFunction(sceGeEdramGetSizeFunction);
			mm.removeFunction(sceGeEdramGetAddrFunction);
			mm.removeFunction(sceGeEdramSetAddrTranslationFunction);
			mm.removeFunction(sceGeGetCmdFunction);
			mm.removeFunction(sceGeGetMtxFunction);
			mm.removeFunction(sceGeSaveContextFunction);
			mm.removeFunction(sceGeRestoreContextFunction);
			mm.removeFunction(sceGeListEnQueueFunction);
			mm.removeFunction(sceGeListEnQueueHeadFunction);
			mm.removeFunction(sceGeListDeQueueFunction);
			mm.removeFunction(sceGeListUpdateStallAddrFunction);
			mm.removeFunction(sceGeListSyncFunction);
			mm.removeFunction(sceGeDrawSyncFunction);
			mm.removeFunction(sceGeBreakFunction);
			mm.removeFunction(sceGeContinueFunction);
			mm.removeFunction(sceGeSetCallbackFunction);
			mm.removeFunction(sceGeUnsetCallbackFunction);
			
		}
	}
	
	
	public void sceGeEdramGetSize(Processor processor) {
		// CpuState cpu = processor.cpu; // New-Style Processor
		Processor cpu = processor; // Old-Style Processor
		Memory mem = Processor.memory;
		
		/* put your own code here instead */

		// int a0 = cpu.gpr[4];  int a1 = cpu.gpr[5];  ...  int t3 = cpu.gpr[11];
		// float f12 = cpu.fpr[12];  float f13 = cpu.fpr[13];  ... float f19 = cpu.fpr[19];

		System.out.println("Unimplemented NID function sceGeEdramGetSize [0x1F6752AD]");

		cpu.gpr[2] = 0xDEADC0DE;

		// cpu.gpr[2] = (int)(result & 0xffffffff);  cpu.gpr[3] = (int)(result  32); cpu.fpr[0] = result;
	}
    
	public void sceGeEdramGetAddr(Processor processor) {
		// CpuState cpu = processor.cpu; // New-Style Processor
		Processor cpu = processor; // Old-Style Processor
		Memory mem = Processor.memory;
		
		/* put your own code here instead */

		// int a0 = cpu.gpr[4];  int a1 = cpu.gpr[5];  ...  int t3 = cpu.gpr[11];
		// float f12 = cpu.fpr[12];  float f13 = cpu.fpr[13];  ... float f19 = cpu.fpr[19];

		System.out.println("Unimplemented NID function sceGeEdramGetAddr [0xE47E40E4]");

		cpu.gpr[2] = 0xDEADC0DE;

		// cpu.gpr[2] = (int)(result & 0xffffffff);  cpu.gpr[3] = (int)(result  32); cpu.fpr[0] = result;
	}
    
	public void sceGeEdramSetAddrTranslation(Processor processor) {
		// CpuState cpu = processor.cpu; // New-Style Processor
		Processor cpu = processor; // Old-Style Processor
		Memory mem = Processor.memory;
		
		/* put your own code here instead */

		// int a0 = cpu.gpr[4];  int a1 = cpu.gpr[5];  ...  int t3 = cpu.gpr[11];
		// float f12 = cpu.fpr[12];  float f13 = cpu.fpr[13];  ... float f19 = cpu.fpr[19];

		System.out.println("Unimplemented NID function sceGeEdramSetAddrTranslation [0xB77905EA]");

		cpu.gpr[2] = 0xDEADC0DE;

		// cpu.gpr[2] = (int)(result & 0xffffffff);  cpu.gpr[3] = (int)(result  32); cpu.fpr[0] = result;
	}
    
	public void sceGeGetCmd(Processor processor) {
		// CpuState cpu = processor.cpu; // New-Style Processor
		Processor cpu = processor; // Old-Style Processor
		Memory mem = Processor.memory;
		
		/* put your own code here instead */

		// int a0 = cpu.gpr[4];  int a1 = cpu.gpr[5];  ...  int t3 = cpu.gpr[11];
		// float f12 = cpu.fpr[12];  float f13 = cpu.fpr[13];  ... float f19 = cpu.fpr[19];

		System.out.println("Unimplemented NID function sceGeGetCmd [0xDC93CFEF]");

		cpu.gpr[2] = 0xDEADC0DE;

		// cpu.gpr[2] = (int)(result & 0xffffffff);  cpu.gpr[3] = (int)(result  32); cpu.fpr[0] = result;
	}
    
	public void sceGeGetMtx(Processor processor) {
		// CpuState cpu = processor.cpu; // New-Style Processor
		Processor cpu = processor; // Old-Style Processor
		Memory mem = Processor.memory;
		
		/* put your own code here instead */

		// int a0 = cpu.gpr[4];  int a1 = cpu.gpr[5];  ...  int t3 = cpu.gpr[11];
		// float f12 = cpu.fpr[12];  float f13 = cpu.fpr[13];  ... float f19 = cpu.fpr[19];

		System.out.println("Unimplemented NID function sceGeGetMtx [0x57C8945B]");

		cpu.gpr[2] = 0xDEADC0DE;

		// cpu.gpr[2] = (int)(result & 0xffffffff);  cpu.gpr[3] = (int)(result  32); cpu.fpr[0] = result;
	}
    
	public void sceGeSaveContext(Processor processor) {
		// CpuState cpu = processor.cpu; // New-Style Processor
		Processor cpu = processor; // Old-Style Processor
		Memory mem = Processor.memory;
		
		/* put your own code here instead */

		// int a0 = cpu.gpr[4];  int a1 = cpu.gpr[5];  ...  int t3 = cpu.gpr[11];
		// float f12 = cpu.fpr[12];  float f13 = cpu.fpr[13];  ... float f19 = cpu.fpr[19];

		System.out.println("Unimplemented NID function sceGeSaveContext [0x438A385A]");

		cpu.gpr[2] = 0xDEADC0DE;

		// cpu.gpr[2] = (int)(result & 0xffffffff);  cpu.gpr[3] = (int)(result  32); cpu.fpr[0] = result;
	}
    
	public void sceGeRestoreContext(Processor processor) {
		// CpuState cpu = processor.cpu; // New-Style Processor
		Processor cpu = processor; // Old-Style Processor
		Memory mem = Processor.memory;
		
		/* put your own code here instead */

		// int a0 = cpu.gpr[4];  int a1 = cpu.gpr[5];  ...  int t3 = cpu.gpr[11];
		// float f12 = cpu.fpr[12];  float f13 = cpu.fpr[13];  ... float f19 = cpu.fpr[19];

		System.out.println("Unimplemented NID function sceGeRestoreContext [0x0BF608FB]");

		cpu.gpr[2] = 0xDEADC0DE;

		// cpu.gpr[2] = (int)(result & 0xffffffff);  cpu.gpr[3] = (int)(result  32); cpu.fpr[0] = result;
	}
    
	public void sceGeListEnQueue(Processor processor) {
		// CpuState cpu = processor.cpu; // New-Style Processor
		Processor cpu = processor; // Old-Style Processor
		Memory mem = Processor.memory;
		
		/* put your own code here instead */

		// int a0 = cpu.gpr[4];  int a1 = cpu.gpr[5];  ...  int t3 = cpu.gpr[11];
		// float f12 = cpu.fpr[12];  float f13 = cpu.fpr[13];  ... float f19 = cpu.fpr[19];

		System.out.println("Unimplemented NID function sceGeListEnQueue [0xAB49E76A]");

		cpu.gpr[2] = 0xDEADC0DE;

		// cpu.gpr[2] = (int)(result & 0xffffffff);  cpu.gpr[3] = (int)(result  32); cpu.fpr[0] = result;
	}
    
	public void sceGeListEnQueueHead(Processor processor) {
		// CpuState cpu = processor.cpu; // New-Style Processor
		Processor cpu = processor; // Old-Style Processor
		Memory mem = Processor.memory;
		
		/* put your own code here instead */

		// int a0 = cpu.gpr[4];  int a1 = cpu.gpr[5];  ...  int t3 = cpu.gpr[11];
		// float f12 = cpu.fpr[12];  float f13 = cpu.fpr[13];  ... float f19 = cpu.fpr[19];

		System.out.println("Unimplemented NID function sceGeListEnQueueHead [0x1C0D95A6]");

		cpu.gpr[2] = 0xDEADC0DE;

		// cpu.gpr[2] = (int)(result & 0xffffffff);  cpu.gpr[3] = (int)(result  32); cpu.fpr[0] = result;
	}
    
	public void sceGeListDeQueue(Processor processor) {
		// CpuState cpu = processor.cpu; // New-Style Processor
		Processor cpu = processor; // Old-Style Processor
		Memory mem = Processor.memory;
		
		/* put your own code here instead */

		// int a0 = cpu.gpr[4];  int a1 = cpu.gpr[5];  ...  int t3 = cpu.gpr[11];
		// float f12 = cpu.fpr[12];  float f13 = cpu.fpr[13];  ... float f19 = cpu.fpr[19];

		System.out.println("Unimplemented NID function sceGeListDeQueue [0x5FB86AB0]");

		cpu.gpr[2] = 0xDEADC0DE;

		// cpu.gpr[2] = (int)(result & 0xffffffff);  cpu.gpr[3] = (int)(result  32); cpu.fpr[0] = result;
	}
    
	public void sceGeListUpdateStallAddr(Processor processor) {
		// CpuState cpu = processor.cpu; // New-Style Processor
		Processor cpu = processor; // Old-Style Processor
		Memory mem = Processor.memory;
		
		/* put your own code here instead */

		// int a0 = cpu.gpr[4];  int a1 = cpu.gpr[5];  ...  int t3 = cpu.gpr[11];
		// float f12 = cpu.fpr[12];  float f13 = cpu.fpr[13];  ... float f19 = cpu.fpr[19];

		System.out.println("Unimplemented NID function sceGeListUpdateStallAddr [0xE0D68148]");

		cpu.gpr[2] = 0xDEADC0DE;

		// cpu.gpr[2] = (int)(result & 0xffffffff);  cpu.gpr[3] = (int)(result  32); cpu.fpr[0] = result;
	}
    
	public void sceGeListSync(Processor processor) {
		// CpuState cpu = processor.cpu; // New-Style Processor
		Processor cpu = processor; // Old-Style Processor
		Memory mem = Processor.memory;
		
		/* put your own code here instead */

		// int a0 = cpu.gpr[4];  int a1 = cpu.gpr[5];  ...  int t3 = cpu.gpr[11];
		// float f12 = cpu.fpr[12];  float f13 = cpu.fpr[13];  ... float f19 = cpu.fpr[19];

		System.out.println("Unimplemented NID function sceGeListSync [0x03444EB4]");

		cpu.gpr[2] = 0xDEADC0DE;

		// cpu.gpr[2] = (int)(result & 0xffffffff);  cpu.gpr[3] = (int)(result  32); cpu.fpr[0] = result;
	}
    
	public void sceGeDrawSync(Processor processor) {
		// CpuState cpu = processor.cpu; // New-Style Processor
		Processor cpu = processor; // Old-Style Processor
		Memory mem = Processor.memory;
		
		/* put your own code here instead */

		// int a0 = cpu.gpr[4];  int a1 = cpu.gpr[5];  ...  int t3 = cpu.gpr[11];
		// float f12 = cpu.fpr[12];  float f13 = cpu.fpr[13];  ... float f19 = cpu.fpr[19];

		System.out.println("Unimplemented NID function sceGeDrawSync [0xB287BD61]");

		cpu.gpr[2] = 0xDEADC0DE;

		// cpu.gpr[2] = (int)(result & 0xffffffff);  cpu.gpr[3] = (int)(result  32); cpu.fpr[0] = result;
	}
    
	public void sceGeBreak(Processor processor) {
		// CpuState cpu = processor.cpu; // New-Style Processor
		Processor cpu = processor; // Old-Style Processor
		Memory mem = Processor.memory;
		
		/* put your own code here instead */

		// int a0 = cpu.gpr[4];  int a1 = cpu.gpr[5];  ...  int t3 = cpu.gpr[11];
		// float f12 = cpu.fpr[12];  float f13 = cpu.fpr[13];  ... float f19 = cpu.fpr[19];

		System.out.println("Unimplemented NID function sceGeBreak [0xB448EC0D]");

		cpu.gpr[2] = 0xDEADC0DE;

		// cpu.gpr[2] = (int)(result & 0xffffffff);  cpu.gpr[3] = (int)(result  32); cpu.fpr[0] = result;
	}
    
	public void sceGeContinue(Processor processor) {
		// CpuState cpu = processor.cpu; // New-Style Processor
		Processor cpu = processor; // Old-Style Processor
		Memory mem = Processor.memory;
		
		/* put your own code here instead */

		// int a0 = cpu.gpr[4];  int a1 = cpu.gpr[5];  ...  int t3 = cpu.gpr[11];
		// float f12 = cpu.fpr[12];  float f13 = cpu.fpr[13];  ... float f19 = cpu.fpr[19];

		System.out.println("Unimplemented NID function sceGeContinue [0x4C06E472]");

		cpu.gpr[2] = 0xDEADC0DE;

		// cpu.gpr[2] = (int)(result & 0xffffffff);  cpu.gpr[3] = (int)(result  32); cpu.fpr[0] = result;
	}
    
	public void sceGeSetCallback(Processor processor) {
		// CpuState cpu = processor.cpu; // New-Style Processor
		Processor cpu = processor; // Old-Style Processor
		Memory mem = Processor.memory;
		
		/* put your own code here instead */

		// int a0 = cpu.gpr[4];  int a1 = cpu.gpr[5];  ...  int t3 = cpu.gpr[11];
		// float f12 = cpu.fpr[12];  float f13 = cpu.fpr[13];  ... float f19 = cpu.fpr[19];

		System.out.println("Unimplemented NID function sceGeSetCallback [0xA4FC06A4]");

		cpu.gpr[2] = 0xDEADC0DE;

		// cpu.gpr[2] = (int)(result & 0xffffffff);  cpu.gpr[3] = (int)(result  32); cpu.fpr[0] = result;
	}
    
	public void sceGeUnsetCallback(Processor processor) {
		// CpuState cpu = processor.cpu; // New-Style Processor
		Processor cpu = processor; // Old-Style Processor
		Memory mem = Processor.memory;
		
		/* put your own code here instead */

		// int a0 = cpu.gpr[4];  int a1 = cpu.gpr[5];  ...  int t3 = cpu.gpr[11];
		// float f12 = cpu.fpr[12];  float f13 = cpu.fpr[13];  ... float f19 = cpu.fpr[19];

		System.out.println("Unimplemented NID function sceGeUnsetCallback [0x05DB22CE]");

		cpu.gpr[2] = 0xDEADC0DE;

		// cpu.gpr[2] = (int)(result & 0xffffffff);  cpu.gpr[3] = (int)(result  32); cpu.fpr[0] = result;
	}
    
	public final HLEModuleFunction sceGeEdramGetSizeFunction = new HLEModuleFunction("sceGe_user", "sceGeEdramGetSize") {
		@Override
		public final void execute(Processor processor) {
			sceGeEdramGetSize(processor);
		}
		@Override
		public final String compiledString() {
			return "jpcsp.HLE.Modules.sceGe_userModule.sceGeEdramGetSize(processor);";
		}
	};
    
	public final HLEModuleFunction sceGeEdramGetAddrFunction = new HLEModuleFunction("sceGe_user", "sceGeEdramGetAddr") {
		@Override
		public final void execute(Processor processor) {
			sceGeEdramGetAddr(processor);
		}
		@Override
		public final String compiledString() {
			return "jpcsp.HLE.Modules.sceGe_userModule.sceGeEdramGetAddr(processor);";
		}
	};
    
	public final HLEModuleFunction sceGeEdramSetAddrTranslationFunction = new HLEModuleFunction("sceGe_user", "sceGeEdramSetAddrTranslation") {
		@Override
		public final void execute(Processor processor) {
			sceGeEdramSetAddrTranslation(processor);
		}
		@Override
		public final String compiledString() {
			return "jpcsp.HLE.Modules.sceGe_userModule.sceGeEdramSetAddrTranslation(processor);";
		}
	};
    
	public final HLEModuleFunction sceGeGetCmdFunction = new HLEModuleFunction("sceGe_user", "sceGeGetCmd") {
		@Override
		public final void execute(Processor processor) {
			sceGeGetCmd(processor);
		}
		@Override
		public final String compiledString() {
			return "jpcsp.HLE.Modules.sceGe_userModule.sceGeGetCmd(processor);";
		}
	};
    
	public final HLEModuleFunction sceGeGetMtxFunction = new HLEModuleFunction("sceGe_user", "sceGeGetMtx") {
		@Override
		public final void execute(Processor processor) {
			sceGeGetMtx(processor);
		}
		@Override
		public final String compiledString() {
			return "jpcsp.HLE.Modules.sceGe_userModule.sceGeGetMtx(processor);";
		}
	};
    
	public final HLEModuleFunction sceGeSaveContextFunction = new HLEModuleFunction("sceGe_user", "sceGeSaveContext") {
		@Override
		public final void execute(Processor processor) {
			sceGeSaveContext(processor);
		}
		@Override
		public final String compiledString() {
			return "jpcsp.HLE.Modules.sceGe_userModule.sceGeSaveContext(processor);";
		}
	};
    
	public final HLEModuleFunction sceGeRestoreContextFunction = new HLEModuleFunction("sceGe_user", "sceGeRestoreContext") {
		@Override
		public final void execute(Processor processor) {
			sceGeRestoreContext(processor);
		}
		@Override
		public final String compiledString() {
			return "jpcsp.HLE.Modules.sceGe_userModule.sceGeRestoreContext(processor);";
		}
	};
    
	public final HLEModuleFunction sceGeListEnQueueFunction = new HLEModuleFunction("sceGe_user", "sceGeListEnQueue") {
		@Override
		public final void execute(Processor processor) {
			sceGeListEnQueue(processor);
		}
		@Override
		public final String compiledString() {
			return "jpcsp.HLE.Modules.sceGe_userModule.sceGeListEnQueue(processor);";
		}
	};
    
	public final HLEModuleFunction sceGeListEnQueueHeadFunction = new HLEModuleFunction("sceGe_user", "sceGeListEnQueueHead") {
		@Override
		public final void execute(Processor processor) {
			sceGeListEnQueueHead(processor);
		}
		@Override
		public final String compiledString() {
			return "jpcsp.HLE.Modules.sceGe_userModule.sceGeListEnQueueHead(processor);";
		}
	};
    
	public final HLEModuleFunction sceGeListDeQueueFunction = new HLEModuleFunction("sceGe_user", "sceGeListDeQueue") {
		@Override
		public final void execute(Processor processor) {
			sceGeListDeQueue(processor);
		}
		@Override
		public final String compiledString() {
			return "jpcsp.HLE.Modules.sceGe_userModule.sceGeListDeQueue(processor);";
		}
	};
    
	public final HLEModuleFunction sceGeListUpdateStallAddrFunction = new HLEModuleFunction("sceGe_user", "sceGeListUpdateStallAddr") {
		@Override
		public final void execute(Processor processor) {
			sceGeListUpdateStallAddr(processor);
		}
		@Override
		public final String compiledString() {
			return "jpcsp.HLE.Modules.sceGe_userModule.sceGeListUpdateStallAddr(processor);";
		}
	};
    
	public final HLEModuleFunction sceGeListSyncFunction = new HLEModuleFunction("sceGe_user", "sceGeListSync") {
		@Override
		public final void execute(Processor processor) {
			sceGeListSync(processor);
		}
		@Override
		public final String compiledString() {
			return "jpcsp.HLE.Modules.sceGe_userModule.sceGeListSync(processor);";
		}
	};
    
	public final HLEModuleFunction sceGeDrawSyncFunction = new HLEModuleFunction("sceGe_user", "sceGeDrawSync") {
		@Override
		public final void execute(Processor processor) {
			sceGeDrawSync(processor);
		}
		@Override
		public final String compiledString() {
			return "jpcsp.HLE.Modules.sceGe_userModule.sceGeDrawSync(processor);";
		}
	};
    
	public final HLEModuleFunction sceGeBreakFunction = new HLEModuleFunction("sceGe_user", "sceGeBreak") {
		@Override
		public final void execute(Processor processor) {
			sceGeBreak(processor);
		}
		@Override
		public final String compiledString() {
			return "jpcsp.HLE.Modules.sceGe_userModule.sceGeBreak(processor);";
		}
	};
    
	public final HLEModuleFunction sceGeContinueFunction = new HLEModuleFunction("sceGe_user", "sceGeContinue") {
		@Override
		public final void execute(Processor processor) {
			sceGeContinue(processor);
		}
		@Override
		public final String compiledString() {
			return "jpcsp.HLE.Modules.sceGe_userModule.sceGeContinue(processor);";
		}
	};
    
	public final HLEModuleFunction sceGeSetCallbackFunction = new HLEModuleFunction("sceGe_user", "sceGeSetCallback") {
		@Override
		public final void execute(Processor processor) {
			sceGeSetCallback(processor);
		}
		@Override
		public final String compiledString() {
			return "jpcsp.HLE.Modules.sceGe_userModule.sceGeSetCallback(processor);";
		}
	};
    
	public final HLEModuleFunction sceGeUnsetCallbackFunction = new HLEModuleFunction("sceGe_user", "sceGeUnsetCallback") {
		@Override
		public final void execute(Processor processor) {
			sceGeUnsetCallback(processor);
		}
		@Override
		public final String compiledString() {
			return "jpcsp.HLE.Modules.sceGe_userModule.sceGeUnsetCallback(processor);";
		}
	};
    
};
